
// Description: Java 11 MssCF Reference for SecForm Relationship Application.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceSecFormApplication binds SecForm.Application
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecFormApplication
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecFormApplication() {
		super();
	}

	public CFSecMssCFReferenceSecFormApplication( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecForm",
			"Application",
			"SecApp" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecFormApplication.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecSecAppObj obj;

		if( genDef instanceof ICFSecSecFormObj ) {
			obj = (ICFSecSecAppObj)((ICFSecSecFormObj)genDef).getRequiredContainerApplication();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecFormObj" );
		}

		return( obj );
	}
}
