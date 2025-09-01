
// Description: Java 11 MssCF Binding for SecGroupForm Column SecFormId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindSecGroupFormSecFormId binds SecGroupForm.SecFormId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecGroupFormSecFormId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecGroupFormSecFormId() {
		super();
	}

	public CFSecMssCFBindSecGroupFormSecFormId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecGroupForm",
			"SecFormId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecGroupFormSecFormId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		int secFormId;
		if( genDef instanceof ICFSecSecGroupFormObj ) {
			secFormId = ((ICFSecSecGroupFormObj)genDef).getRequiredSecFormId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGroupFormObj" );
		}

		return( secFormId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecGroupFormSecFormId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecSecGroupFormObj ) {
			int secFormId = ((ICFSecSecGroupFormObj)genDef).getRequiredSecFormId();
			ret = Integer.toString( secFormId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGroupFormObj" );
		}

		return( ret );
	}

}
