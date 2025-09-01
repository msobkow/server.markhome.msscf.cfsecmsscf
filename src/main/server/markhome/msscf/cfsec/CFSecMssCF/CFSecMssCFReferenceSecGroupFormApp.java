
// Description: Java 11 MssCF Reference for SecGroupForm Relationship App.

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
 *	CFSecMssCFReferenceSecGroupFormApp binds SecGroupForm.App
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecGroupFormApp
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecGroupFormApp() {
		super();
	}

	public CFSecMssCFReferenceSecGroupFormApp( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecGroupForm",
			"App",
			"SecApp" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecGroupFormApp.dereference() ";

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

		if( genDef instanceof ICFSecSecGroupFormObj ) {
			obj = (ICFSecSecAppObj)((ICFSecSecGroupFormObj)genDef).getRequiredParentApp();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGroupFormObj" );
		}

		return( obj );
	}
}
